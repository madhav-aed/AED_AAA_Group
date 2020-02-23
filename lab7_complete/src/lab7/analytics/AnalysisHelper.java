/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
   

    public void getFiveInactiveUsersTotalPostsNums(){
        Map<Integer, Post> postMap = DataStore.getInstance().getPosts();
        HashMap<Integer, Integer> totalPosts = new HashMap<>();
            Map<Integer, User> users = DataStore.getInstance().getUsers();
        
        // Summing up for loop
        for(Post post: postMap.values())
        {
            int postCount = 0; 
            if(!totalPosts.containsKey(post.getUserId()))
            {
                totalPosts.put(post.getUserId(),++postCount);
            }
            else
            {
               Integer newPostCount = totalPosts.get(post.getUserId());
               ++newPostCount;
               totalPosts.replace(post.getUserId(), newPostCount);
            }
                
        }
        
        totalPosts = sortByValue(totalPosts);
//        System.out.println(" sorted total post : "+ totalPosts);
        
        
       System.out.println(" Top 5 inactive users based on Post numbers");
       for(int i = 0; i<totalPosts.size() && i <5; i++){
           System.out.println(users.get(totalPosts.get(i)));
       }
        
        
//        
//        
//        System.out.println("post sort postnumbers : "+totalPosts); 
//        ArrayList<Integer> postNumbers = new ArrayList<>();
//        
//        // Sorting below
//        
//        for(Integer userIds : totalPosts.keySet()){
//            postNumbers.add(totalPosts.get(userIds));        
//        }
//
//        Collections.sort(postNumbers);
//        
//        for(Integer i : postNumbers)
//        {        
//           for(Integer  userId : totalPosts.keySet()){      
//               if(totalPosts.get(userId).equals(i))
//                {
//                   System.out.println("User id : "+userId);
//                }   
//            }
//        }        
    }    
    
    public void inactiveUsersBasedOnComments(){
    
        Map<Integer,User> users = DataStore.getInstance().getUsers();

        List<User> commentList = new ArrayList<>(users.values());

        Collections.sort(commentList, new Comparator<User>(){
        @Override
        public int compare(User u1, User u2){
           return u1.getComments().size() - u2.getComments().size();
        }
        });
       System.out.println("5. Top 5 inactive users based on comments.");
       for(int i = 0; i<commentList.size() && i <5; i++){
           System.out.println(commentList.get(i));
       }

}
  // Referred from GeeksForGeeks :             System.out.println(" sorted total post : "+ totalPosts);
  public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }         
}
