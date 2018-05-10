<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Interactive System</title>
    </head>
    <body >       
            <h2>Assignment3</h2>
            <p class="sub">Create by<name>YunHao Wu</name>  </p>
           <% if(((String)session.getAttribute("message"))==null){%>
            <form action="demoservlet" method="post">
                <p  >Design</p>	
                <div style="width:400px;
                	height:2px;
                	margin:0px ;
                	padding:0px;
                	background-color:black;
                	overflow:hidden;">
                </div>
                </br>
                    <p  >Input the message<input type="text1" name="message" value="Hello!"> </p>      
           <p  >Message Font Size:<input type="text2" name="ftsize" value="15"> 
                 <p> Font Color: 
                   			 	<select name="color"> 
									<option value="black" /> Black</option> 
									<option value="blue" selected = "selected"/> Blue </option> 
									<option value="cyan" /> Cyan</option> 
									<option value="darkGray" /> Dark Gray</option> 
									<option value="gray" /> Gray</option> 
									<option value="green" /> Green</option> 
									<option value="lightGray" /> Light Gray</option> 
									<option value="magenta" /> Magenta</option> 
									<option value="orange" /> Orange</option> 
									<option value="pink" /> Pink</option> 
									<option value="red" /> Red</option> 
									<option value="white" /> White</option> 
									<option value="yellow" /> Yellow</option> 
								</select> 	
                    </p>         
                  <p  >Font style: 
                    <select name="ftstyle"> 
									<option value="REGULAR" /> Regular</option> 
									<option value="BOLD" selected = "selected"/>  Bold </option> 
									<option value="ITALIC" /> Italic </option> 
									<option value="BOLD ITALIC" /> Bold Italic</option>
									</select>                   
                    </p>
                </br>
                <div style="width:400px;
                	height:1px;
                	margin:0px 0 0 20 ;
                	padding:0px;
                	background-color:gray;
                	overflow:hidden;">
                </div>             
                	              
                    <p  >Select the shape
                     <select name="shape"> 
									<option value="OVAL" selected = "selected" /> Oval</option> 
									<option value="RECT"  /> Rectangle  </option> 
									<option value="ROUNDRECT" /> Round Rectangle </option> 
									</select>  
                    </p>
                                                         
                    <p >Shape Width(px): <input type="text2" name="px" value="125">  </p>
                    <p>Shape Height(py): <input type="text2" name="py" value="40"> </p>
               
                          
						<p> Background Color:
						<select name="bgcolor"> 
							<option value="black" /> Black</option> 
							<option value="blue" /> Blue </option> 
							<option value="cyan" /> Cyan</option> 
							<option value="darkGray" /> Dark Gray</option> 
							<option value="gray" selected = "selected"/> Gray</option> 
							<option value="green" /> Green</option> 
							<option value="lightGray" /> Light Gray</option> 
							<option value="magenta" /> Magenta</option> 
							<option value="orange" /> Orange</option> 
							<option value="pink" /> Pink</option> 
							<option value="red" /> Red</option> 
							<option value="white" /> White</option> 
							<option value="yellow" /> Yellow</option> 
						</select> 
				      </p>   
                    </br>
                 <div style="width:400px;
                	height:1px;
                	margin:0px 0 0 20 ;
                	padding:0px;
                	background-color:gray;
                	overflow:hidden;">
                </div>

                 
                <p  >Applet Size <extra>(MAX:999*999)</extra></p>
                <p  >Applet Width(ax): <input type="text2" name="ax" placeholder="type Number" value="300"></p>
                <p>  Applet Height(ay): <input type="text2" name="ay" placeholder="type Number" value="250"> </p>
                
            
            
            <a>
               <input type="submit"  value="Show!" />
            </a>
            </form>


         
                 <applet code="Assignment2.class" width=300 height=250>
					<param name="message" value="Hello!"  />
					<param name="shape" value="OVAL"  />
					<param name="color" value="blue" />
			    	<param name="bgcolor" value="gray" />
					<param name="px" value="125" />
					<param name="py" value="40" />
                    <param name="ax" value="300" />
                    <param name="ay" value="250" />
					<param name="ftstyle" value="BOLD" />
					<param name="ftsize" value="15" />
				</applet>
          

<%}else{ %>      
        
            <form action="demoservlet" method="post">
               <p >Design</p>
                    
                <div style="width:400px;
                    height:2px;
                    margin:0px ;
                    padding:0px;
                    background-color:black;
                    overflow:hidden;">
                </div>
                </br>
                <p  >Input the message<input   type="text1" name="message" value="<%=session.getAttribute("message")%>"> </p>      
                    <p  >Message Font Size:<input type="text2" name="ftsize" value="<%=session.getAttribute("ftsize")%>"> </p>                    
                     <p>Font Color   
                                <select name="color"> 
                                    <option value="black" /> Black</option> 
                                    <option value="blue" selected = "selected"/> Blue </option> 
                                    <option value="cyan" /> Cyan</option> 
                                    <option value="darkGray" /> Dark Gray</option> 
                                    <option value="gray" /> Gray</option> 
                                    <option value="green" /> Green</option> 
                                    <option value="lightGray" /> Light Gray</option> 
                                    <option value="magenta" /> Magenta</option> 
                                    <option value="orange" /> Orange</option> 
                                    <option value="pink" /> Pink</option> 
                                    <option value="red" /> Red</option> 
                                    <option value="white" /> White</option> 
                                    <option value="yellow" /> Yellow</option> 
                                </select>                         
                    </p>                                                                                                                               
                    <p  >Font style: 
                    <select name="ftstyle"> 
									<option value="REGULAR" /> Regular</option> 
									<option value="BOLD" selected = "selected"/>  Bold </option> 
									<option value="ITALIC" /> Italic </option> 
									<option value="BOLD ITALIC" /> Bold Italic</option>
									</select>  
                    
                    </p>                
                <div style="width:400px;
                    height:1px;
                    margin:0px 0 0 20 ;
                    padding:0px;
                    background-color:gray;
                    overflow:hidden;">
                </div>
                   </br>                                   
                     <p  >Select the shape
                     <select name="shape"> 
									<option value="OVAL" selected = "selected" /> Oval</option> 
									<option value="RECT"  /> Rectangle  </option> 
									<option value="ROUNDRECT" /> Round Rectangle </option> 							
									</select>  
                    </p>                        
                    <p class="t2">Shape Width(px): <input type="text2" name="px" value="<%=session.getAttribute("px") %>"> </p>
                    <p> Shape Height(py): <input type="text2" name="py"  value="<%=session.getAttribute("py") %>"> </p>              
                
              
            
                        <p> Background Color:  
                        <select name="bgcolor"> 
                            <option value="black" /> Black</option> 
                            <option value="blue" /> Blue </option> 
                            <option value="cyan" /> Cyan</option> 
                            <option value="darkGray" /> Dark Gray</option> 
                            <option value="gray" selected = "selected" /> Gray</option> 
                            <option value="green" /> Green</option> 
                            <option value="lightGray" /> Light Gray</option> 
                            <option value="magenta" /> Magenta</option> 
                            <option value="orange" /> Orange</option> 
                            <option value="pink" /> Pink</option> 
                            <option value="red" /> Red</option> 
                            <option value="white" /> White</option> 
                            <option value="yellow" /> Yellow</option> 
                        </select> 
                       </p>
              
                 <div style="width:400px;
                    height:1px;
                    margin:0px 0 0 20 ;
                    padding:0px;
                    background-color:gray;
                    overflow:hidden;">
                </div>
                </br>
                <p  >Applet Size <extra>(MAX:999*999)</extra></p>
                <p  >Applet Width(ax): <input type="text2" name="ax" value="<%=session.getAttribute("ax")%>"></p>
                <p>  Applet Height(ay): <input type="text2" name="ay" value="<%=session.getAttribute("ay")%>"> </p>
                
            
            <a>
               <input type="submit"   value="Show!" />
            </a>
            </form>
            <applet code="Assignment2.class" width="<%=session.getAttribute("ax")%>" height="<%=session.getAttribute("ay")%>">
                    <param name="message" value="<%=session.getAttribute("message")%>"  />
                    <param name="shape" value="<%=session.getAttribute("shape") %>"  />
                    <param name="color" value="<%=session.getAttribute("color")%>" />
                    <param name="bgcolor" value="<%=session.getAttribute("bgcolor") %>" />
                    <param name="px" value="<%=session.getAttribute("px") %>" />
                    <param name="py" value="<%=session.getAttribute("py") %>" />
                    <param name="ax" value="<%=session.getAttribute("ax") %>" />
                    <param name="ay" value="<%=session.getAttribute("ay") %>" />
                    <param name="ftstyle" value="<%=session.getAttribute("ftstyle") %>" />
                    <param name="ftsize" value="<%=session.getAttribute("ftsize") %>" />
            </applet>
            
        <%}%> 

    </body>
</html>