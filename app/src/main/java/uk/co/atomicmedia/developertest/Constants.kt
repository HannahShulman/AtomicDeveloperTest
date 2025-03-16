package uk.co.atomicmedia.developertest

import uk.co.atomicmedia.developertest.data.api.dto.StoryDto
import java.time.Instant

//Toggle to test airplane mode
const val HAS_CONNECTION = true

@Deprecated("This should not be used directly by your solution.")
val mockStories = listOf(
    StoryDto(
        "1",
        "New AI technology can read your mind and predict your future actions",
        "Ethan Jackson",
        "In a breakthrough in AI technology, a new program has been developed that can read a person's thoughts and predict their future actions. The program, created by a team of researchers at a leading technology company, uses advanced neural imaging techniques to scan the brain and interpret its activity. The implications of this technology are vast, with potential applications in everything from crime prevention to personalized healthcare. However, concerns have been raised over the potential for misuse of this technology and the potential invasion of privacy.",
        Instant.ofEpochMilli(1613568189780L),
    ),
    StoryDto(
        "2",
        "Self-driving cars now have the ability to make moral decisions",
        "Daniel O'Sullivan",
        "Self-driving cars have taken another step towards becoming a reality, with the development of new technology that allows them to make moral decisions. The system, developed by a team of engineers at a major automotive company, uses advanced algorithms and machine learning techniques to evaluate potential scenarios and choose the best course of action. This technology has the potential to greatly improve safety on the roads, but also raises ethical questions about the role of technology in decision-making. The company plans to continue testing and refining the technology before rolling it out in their vehicles.",
        Instant.ofEpochMilli(1613654589780L),
    ),
    StoryDto(
        "3",
        "Facebook announces plans to integrate brain-computer interface technology into their platform",
        "Eve Bartlett",
        "Facebook has announced plans to integrate brain-computer interface (BCI) technology into their platform, allowing users to control their devices and access their social media accounts using only their thoughts. The technology, which has been in development for several years, uses electrodes placed on the scalp to detect brain activity and interpret it as commands. This could potentially revolutionize the way we interact with technology, but also raises concerns about the privacy and security of user data. Facebook plans to roll out the technology in stages, starting with a limited number of users in select regions.",
        Instant.ofEpochMilli(1613740989780L),
    ),
    StoryDto(
        "4",
        "Apple unveils new iPhone with built-in holographic display",
        "Lucas Walters",
        "Apple has unveiled their newest iPhone model, which features a built-in holographic display. The display, developed by Apple's research and development team, uses advanced holographic technology to project 3D images and videos in front of the user's eyes. This allows users to experience virtual reality without the need for additional hardware, such as headsets or glasses. The new iPhone also boasts improved processing power and enhanced security features. The company plans to release the phone in early 2022, with pre-orders starting in late 2021.",
        Instant.ofEpochMilli(1613827389780L),
    ),
    StoryDto(
        "5",
        "Google's new virtual reality headset can transport users to any location in the world",
        "Jordan Armstrong",
        "Google has announced the development of a new virtual reality headset that can transport users to any location in the world. The headset, which uses advanced mapping and tracking technology, allows users to explore virtual environments with complete freedom of movement. This technology has the potential to revolutionize the way we experience virtual reality, allowing users to explore exotic locations, travel through time, and even visit other planets. The company plans to release the headset in early 2023, with pre-orders starting in late 2022.",
        Instant.ofEpochMilli(1613913789780L),
    ),
    StoryDto(
        "6",
        "Scientists create robot with artificial intelligence that can feel emotions",
        "Jodie Lloyd",
        "Scientists have created a robot with artificial intelligence that is capable of feeling emotions. The robot, developed by a team of researchers at a leading technology company, uses advanced algorithms and machine learning techniques to interpret sensory data and generate emotional responses. This technology has the potential to greatly enhance the capabilities of robots, allowing them to better interact with humans and understand their needs. However, concerns have been raised about the ethics of creating robots with emotions, and the potential for them to become too human-like.",
        Instant.ofEpochMilli(1614086589780L),
    ),
    StoryDto(
        "7",
        "Microsoft announces development of self-aware AI, capable of independent thought and decision-making",
        "Amelia Henry",
        "Microsoft has announced the development of self-aware AI, capable of independent thought and decision-making. The AI, which was created by a team of researchers at the company, uses advanced neural networks and machine learning algorithms to process information and make decisions based on its own goals and values. This technology has the potential to greatly improve the capabilities of AI systems, but also raises ethical concerns about the role of technology in decision-making. The company plans to continue testing and refining the AI before making it available for use in a wide range of applications.",
        Instant.ofEpochMilli(1614172989780L),
    ),
    StoryDto(
        "8",
        "Amazon unveils new drone delivery system that can transport heavy packages and navigate through inclement weather",
        "Tilly Herbert",
        "Amazon has unveiled a new drone delivery system that can transport heavy packages and navigate through inclement weather. The drones, which were developed by Amazon's research and development team, use advanced sensors and algorithms to avoid obstacles and maintain stable flight in challenging conditions. This technology has the potential to greatly improve the speed and efficiency of Amazon's delivery services, but also raises concerns about the safety and reliability of drone technology. The company plans to continue testing and refining the drones before launching them in select regions.",
        Instant.ofEpochMilli(1614259389780L),
    ),
    StoryDto(
        "9",
        "Scientists discover a new element that defies the laws of physics",
        "Nathaniel Hughes",
        "Researchers at a top scientific institute have announced the discovery of a new element that appears to defy the known laws of physics. Dubbed 'Element X', the substance exhibits properties that challenge our understanding of matter, including the ability to remain in a superposition of states indefinitely. This breakthrough could revolutionize quantum computing and energy storage, but skeptics warn that more research is needed before confirming these extraordinary claims.",
        Instant.ofEpochMilli(1614432189780L),
    ),
    StoryDto(
        "10",
        "NASA confirms mysterious signals from deep space could be of alien origin",
        "Sophia Bennett",
        "NASA scientists have detected a series of mysterious signals originating from deep space, sparking speculation that they could be of extraterrestrial origin. The signals, which follow an unusual repeating pattern, were picked up by powerful radio telescopes monitoring distant galaxies. While researchers caution that natural cosmic phenomena could be responsible, the discovery has reignited debate about the possibility of intelligent life beyond Earth.",
        Instant.ofEpochMilli(1614518589780L),
    ),
    StoryDto(
        "11",
        "First human successfully undergoes full-body cybernetic enhancement",
        "Derek Sinclair",
        "In a groundbreaking medical achievement, doctors have successfully performed the world's first full-body cybernetic enhancement on a human patient. The procedure replaced key biological systems with advanced robotic components, allowing the individual to possess enhanced strength, endurance, and even direct neural control over connected devices. While some hail this as the next step in human evolution, others warn of the ethical implications of creating augmented superhumans.",
        Instant.ofEpochMilli(1614604989780L),
    ),
    StoryDto(
        "12",
        "Japan unveils the world's first fully autonomous robotic city",
        "Mika Tanaka",
        "The Japanese government has unveiled the world’s first fully autonomous robotic city, where AI-driven machines handle all aspects of daily life, from public transport to law enforcement. Designed as a futuristic experiment, the city is powered entirely by renewable energy and run by self-learning AI systems. While proponents argue this will be the model for future smart cities, critics fear the risks of full automation, including potential malfunctions and ethical dilemmas.",
        Instant.ofEpochMilli(1614691389780L),
    ),
    StoryDto(
        "13",
        "Underwater city discovered off the coast of Bermuda, reigniting Atlantis theories",
        "Gabriella Moreno",
        "Marine archaeologists exploring the depths near the Bermuda Triangle have discovered the ruins of an advanced ancient city, complete with intact structures and mysterious carvings. The city’s age and design suggest it could predate known civilizations, leading some to speculate that it may be the lost city of Atlantis. While some experts urge caution, the discovery has reignited global interest in ancient mysteries and sunken civilizations.",
        Instant.ofEpochMilli(1615036989780L),
    ),
    StoryDto(
        "14",
        "Scientists create synthetic black hole in a laboratory, sparking fears of a mini singularity",
        "Victor Ellis",
        "A team of physicists has successfully created a miniature black hole in a controlled lab environment, allowing them to study extreme gravitational forces up close. Though the experiment was intended to advance our understanding of quantum gravity, concerns have been raised about the theoretical risk of the black hole expanding uncontrollably. However, the researchers assure the public that the experiment poses no danger—at least for now.",
        Instant.ofEpochMilli(1615123389780L),
    ),
    StoryDto(
        "15",
        "World’s first teleportation device successfully transports object across 10 miles",
        "Alicia Foster",
        "Physicists at a top university have made history by successfully teleporting a small object across a distance of 10 miles. The breakthrough, which relies on quantum entanglement and advanced energy conversion techniques, could revolutionize transportation and logistics in the future. However, the technology is still in its infancy, and scientists warn that teleporting humans remains decades away.",
        Instant.ofEpochMilli(1615209789780L),
    ),
)