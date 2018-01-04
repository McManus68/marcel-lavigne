import { Event } from '../model/Event';

export class MockedService  {
  getEvents(): Event[] {
    const events : Event [] = [];
    events.push({
      id: 1,
      name: 'Dégustation de vins italiens',
      type: 'Wine',
      place: 'Domaine du Mas du Ministre',
      address: '547 rue du Maréchal Poirier',
      participants: 15,
      capacity: 50,
      price: 15,
      date: '15 janvier 20h30',
      images: ['event-1.jpg', 'event-2.jpg', 'event-3.jpg']
    });
    events.push({
      id: 2,
      name: 'Initiation dégustation en groupe',
      type: 'Wine',
      place: 'Domaine Petit Chaumont',
      address: 'Petit Chaumont - D62',
      participants: 8,
      capacity: 20,
      price: 20,
      date: '18 janvier 19h',
      images: ['event-1.jpg', 'event-2.jpg', 'event-3.jpg']
    });
    events.push({
      id: 3,
      name: 'Découverte des vins Andalous',
      type: 'Wine',
      place: 'Château Grand Boise',
      address: 'Petit Chaumont - D62',
      participants: 47,
      capacity: 60,
      price: 35,
      date: '22 janvier 14h',
      images: ['event-1.jpg', 'event-2.jpg', 'event-3.jpg']
    });
    events.push({
      id: 4,
      name: 'Dégustation champêtre de vins Provencaux',
      type: 'Wine',
      place: 'Domaine de Verchant',
      address: 'Petit Chaumont - D62',
      participants: 16,
      capacity: 16,
      price: 21,
      date: '24 janvier 16h',
      images: ['event-1.jpg', 'event-2.jpg', 'event-3.jpg']
    });
    events.push({
      id: 5,
      name: "Cours d'oenologie au domaine Lafarge",
      type: 'Wine',
      place: 'Domaine Lafarge',
      address: 'Petit Chaumont - D62',
      participants: 4,
      capacity: 8,
      price: 40,
      date: '26 janvier 14h',
      images: ['event-1.jpg', 'event-2.jpg', 'event-3.jpg']
    });
    events.push({
      id: 6,
      name: 'Initiation aux vins Bordelais',
      type: 'Wine',
      place: 'Trinque Fougasse',
      address: 'Petit Chaumont - D62',
      participants: 15,
      capacity: 20,
      price: 10,
      date: '28 janvier 14h',
      images: ['event-1.jpg', 'event-2.jpg', 'event-3.jpg']
    });
    events.push({
      id: 7,
      name: 'Découverte des vins Andalous',
      type: 'Wine',
      place: 'Château Grand Boise',
      address: 'Petit Chaumont - D62',
      participants: 7,
      capacity: 20,
      price: 20,
      date: '31 janvier 16h',
      images: ['event-1.jpg', 'event-2.jpg', 'event-3.jpg']
    });
    events.push({
      id: 8,
      name: 'Découverte des vins Andalous',
      type: 'Wine',
      place: 'Domaine du chateau Florac',
      address: 'Petit Chaumont - D62',
      participants: 4,
      capacity: 25,
      price: 9,
      date: '05 février 20h',
      images: ['event-1.jpg', 'event-2.jpg', 'event-3.jpg']
    });

    return events;
  }


}
